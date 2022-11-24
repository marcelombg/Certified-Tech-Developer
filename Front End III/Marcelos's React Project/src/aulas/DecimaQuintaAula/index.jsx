import { useState } from 'react'
import { useParams } from 'react-router-dom'
import { DecimaQuintaAulaItem } from '../../components/DecimaQuintaAulaItem'
import './style.scss'

export function DecimaQuintaAula() {

    const [locations, setLocations] = useState([])
    const [cep, setCep] = useState('')
    const [formularioErro, setFormularioErro] = useState(false)
    const [cepErro, setCepErro] = useState(false)
    const { id } = useParams()


    function searchCep(event) {

        event.preventDefault();
             
        if (cep.length > 7 && cep.length < 9) {

            if(cep.length == 8) {

                fetch(`https://viacep.com.br/ws/${cep}/json/`).then(
                    response => {
                        response.json().then(
                            address => {
    
                                if (address.erro !== undefined) {
                                    //Deu erro
                                    setCepErro(true)
                                    setFormularioErro(false)
                                    setCep('')

                                } else {
                                    //Deu sucesso
                                    setFormularioErro(false)
                                    setCepErro(false)
                                    setLocations([...locations, address])
                                    setCep('')
                                }
                            }
                        )
                    }
                )
            } 
        } else {
            setFormularioErro(true)
            setCepErro(false)
            setCep('')
        }
    }

    function deleteLocation(currentLocation) {

        console.log(currentLocation.cep)

        locations.map((location) => {
            if (location.cep === currentLocation.cep) {
                setLocations(locations.filter((currentLocation) => location.cep !== currentLocation.cep))
            }
        })
    }

    return (

        <div className='decima-quarta-aula-component'>

            <form name={cepErro ? 'cep-form-error' : ''} className={formularioErro ? 'form-error' : ''} onSubmit={event => searchCep(event)}>

                <h1>Cadastrar endereços</h1>

                <div>
                    <label>Cep</label>
                    <input
                        type='number'
                        value={cep}
                        onChange={(event) => setCep(event.target.value)}
                    />
                </div>

                {
                    formularioErro ? (
                        <span>O CEP não possui 8 caracteres</span>
                    ) : null
                }
                {
                    cepErro ? (
                        <span>CEP inexistente</span>
                    ) : null
                }

                <button type='submit'>Cadastrar</button>

            </form>

            <section className='locations'>
                
                {
                    locations.map(
                        (location, index) => {
                            return (
                                <DecimaQuintaAulaItem
                                    key={index}
                                    data={location}
                                    onDeleteLocation={currentLocation => deleteLocation(currentLocation)}
                                />
                            )
                        }
                    )
                }

            </section>

        </div>

    )

}