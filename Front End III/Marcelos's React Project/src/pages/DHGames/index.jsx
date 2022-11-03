import { GamesSectionVerticalItem } from '../../components/GamesSectionVerticalItem'
import './style.scss'
import { newGames, halloweenGames, earlyAccessGames } from './games.js'

export function DHGames() {

    return (
        <div className="dh-games-component">

            <main className="dh-games-main-content">

                <section className="games-section">

                    <h1 className="games-section-title">New Games</h1>

                    <section className='games'>
                        {

                            newGames.map(
                                game => {
                                    return (
                                        <GamesSectionVerticalItem
                                            game={game}
                                        />
                                    )
                                }
                            )

                        }
                    </section>

                </section>

                <section className="games-section">

                    <h1 className="games-section-title">Early Access Games</h1>

                    <section className='games'>
                        {

                            earlyAccessGames.map(
                                game => {
                                    return (
                                        <GamesSectionVerticalItem
                                            type='vertical'
                                            game={game}
                                        />
                                    )
                                }
                            )

                        }
                    </section>

                </section>

            </main>

        </div>
    )

}