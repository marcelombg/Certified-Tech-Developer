import { useState } from 'react'
import { DecimaQuintaAulaItem } from '../../components/DecimaQuintaAulaItem'
import './style.scss'


export function DecimaQuintaAula() {

    const [locations, setLocations] = useState([])
    const [cep, setCep] = useState('')
    const [formularioErro, setFormularioErro] = useState(false)
    const [botao, setBotao] = useState(false)
   

    function searchCep(cepRecieved) {

        setCep(cepRecieved)

        if (cepRecieved.length === 8) {

            fetch(`https://viacep.com.br/ws/${cepRecieved}/json/`).then(
                response => {
                    response.json().then(
                        address => {

                            if (address.erro !== undefined) {
                                //Deu erro
                                setFormularioErro(true)

                            } else {
                                //Deu sucesso
                                setFormularioErro(false)
                                setLocations([...locations, address])
                                setCep('')
                            }
                        }
                    )

                }

            )

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

        <div className="decima-quarta-aula-component">

            <form className={formularioErro ? 'form-error' : ''}>

                <h1>Cadastrar endereços</h1>

                <div>
                    <label>Cep</label>
                    <input
                        type="number"
                        value={cep}
                        onChange={event => searchCep(event.target.value)}
                    />
                </div>

                {
                    formularioErro ? (
                        <span>O seu formulario contém erros</span>
                    ) : null
                }            
            </form>

            <section className="locations">

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