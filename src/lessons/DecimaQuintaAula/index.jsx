import { useEffect } from 'react'
import { useState } from 'react'
import { useParams } from 'react-router-dom'

import { DecimaQuintaAulaItem } from '../../components/DecimaQuintaAulaItem'

import './style.scss'

export function DecimaQuintaAula() {

    const [locations, setLocations] = useState([])
    const [cep, setCep] = useState('')

    // const { id } = useParams()

    useEffect(() => {

        // request baseada no Id

    }, [])

    function searchCep(cepRecieved) {

        setCep(cepRecieved)

        if(cepRecieved.length === 8) {

            fetch(`https://viacep.com.br/ws/${cepRecieved}/json/`).then(
                response => {
                    response.json().then(
                        address => {

                            if(address.erro !== undefined) {

                                // Deu erro

                            } else {

                                // Deu Sucesso
                                setLocations([...locations, address])

                            }
                        }
                    )
                }
            )

        }

    }



    function deleteLocation(currentLocation) {

        console.log(currentLocation)

    }

    return(

        <div className="decima-quarta-aula-component">

            <form>

                <h1>Cadastrar endereços</h1>

                <div>
                    <label>Cep</label>
                    <input
                        type="number"
                        value={cep}
                        aria-label="cep"
                        onChange={event => searchCep(event.target.value)}
                    />
                </div>

                <button
                    aria-label="submit-button"
                >Cadastrar</button>

            </form>

            <section className="locations">

                {
                    locations.map(
                        (location, index) => (
                            <DecimaQuintaAulaItem
                                key={index}
                                data={location}
                                onDeleteLocation={currentLocation => deleteLocation(currentLocation)}
                            />
                        )
                    )
                }

            </section>

        </div>

    )

}