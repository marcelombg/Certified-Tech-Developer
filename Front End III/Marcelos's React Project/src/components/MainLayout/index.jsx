import { Link, Outlet } from 'react-router-dom'
import './style.scss'

export function MainLayout() {
    return(
        <div class='main-layout-component'>
        
            <header class='main-layout-component-header'>

                <h1> Layout Principal </h1>

                <ul>
                    <li>
                        <Link to="login">Login</Link>
                    </li>

                    <li>
                        <Link to="segundaaula">Segunda Aula</Link>
                    </li>

                    <li>
                        <Link to="terceiraaula">Terceira Aula</Link>
                    </li>

                    <li>
                        <Link to="quartaaula">Quarta Aula</Link>
                    </li>

                    <li>
                        <Link to="quintaaula">Quinta Aula</Link>
                    </li>

                    <li>
                        <Link to="setimaaula">Sétima Aula</Link>
                    </li>

                    <li>
                        <Link to="oitavaaula">Oitava Aula</Link>
                    </li>

                    <li>
                        <Link to="decimaterceiraaula">Decima Terceira Aula</Link>
                    </li>

                    <li>
                        <Link to="decimaquartaaula">Decima Quarta Aula</Link>
                    </li>

                    <li>
                        <Link to="decimaquintaaula">Decima Quinta Aula</Link>
                    </li>

                </ul>

            </header>

            <main class='main-layout-component-main'>

                <p> O conteúdo será carregado aqui dentro</p>
                
                <Outlet/>

            </main>

            
        </div>
    )
}