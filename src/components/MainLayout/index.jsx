import { Link, Outlet } from 'react-router-dom'

import './style.scss'

export function MainLayout() {

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

            </header>

            <main className='main-layout-component-main'>

                <p>O conteúdo será carregado aqui dentro:</p>

                <Outlet />

            </main>

        </div>
    )

}