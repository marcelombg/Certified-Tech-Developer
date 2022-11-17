import { useState } from 'react'
import { DecimaQuintaAulaItem } from '../../components/DecimaQuintaAulaItem'
import './style.scss'

export function DecimaQuintaAula() {

    const [locations, setLocations] = useState([1, 0, 2])
    const [cep, setCep] = useState(0)

    function searchCep(cepRecieved) {



    }

    return(

        <div className="decima-quarta-aula-component">

            <form>

                <h1>Cadastrar endereços</h1>

                <div>
                    <label htmlFor="">Cep</label>
                    <input type="number" value={cep} onChange={event => searchCep(event.target.value)} />
                </div>

                <button>Cadastrar</button>

            </form>

            <section className="locations">

                {
                    locations.map(
                        location => {
                            return (
                                <DecimaQuintaAulaItem
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