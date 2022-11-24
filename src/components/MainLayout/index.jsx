import { Link, Outlet } from 'react-router-dom'

import './style.scss'

export function MainLayout() {

    const items = [{ id: 1, name: 'Reportagem 1' }, { id: 2, name: 'Reportagem 2' }]

    return (
        <div className="main-layout-component">

            <header className='main-layout-component-header'>

                <h1>Layout Principal</h1>

                <ul>

                    <li>

                        <Link to="decima-quarta-aula">Decima Quarta Aula</Link>

                    </li>

                    <li>

                        <Link to="decima-quinta-aula">Decima Quinta Aula</Link>

                    </li>

                </ul>

                {

                    items.map(
                        item => {
                            return (
                                <>
                                    <Link to={`decima-quinta-aula/${item.id}`}>{item.name}</Link>
                                    <br />
                                </>
                            )

                        }

                    )

                }

            </header>

            <main className='main-layout-component-main'>

                <p>O conteúdo será carregado aqui dentro:</p>

                <Outlet />

            </main>

        </div>
    )

}