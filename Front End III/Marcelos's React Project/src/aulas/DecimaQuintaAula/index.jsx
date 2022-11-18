import { useState } from 'react'
import { DecimaQuintaAulaItem } from '../../components/DecimaQuintaAulaItem'
import './style.scss'

export function DecimaQuintaAula() {

    const [locations, setLocations] = useState([])
    const [cep, setCep] = useState('')

    function searchCep(cepRecieved) {

        setCep(cepRecieved)

    }

    return(

        <div className="decima-quarta-aula-component">

            <form>

                <h1>Cadastrar endereços</h1>

                <div>
                    <label htmlFor="">Cep</label>
                    <input
                        type="number"
                        value={cep}
                        onChange={event => searchCep(event.target.value)}
                    />
                </div>

                <button>Cadastrar</button>

            </form>

            <section className="locations">

                {
                    locations.map(
                        (location, index) => {
                            return (
                                <DecimaQuintaAulaItem
                                    key={index}
                                    data={location}
                                />
                            )
                        }
                    )
                }

            </section>

        </div>

    )

}