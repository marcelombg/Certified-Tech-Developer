import { Link, Outlet } from 'react-router-dom'
import './style.scss'

export function MainLayout() {

    return (
        <body>

            <header>


                <div>

                    <h1> Aulas </h1>

                    <nav>

                        <ul>
                            <li><a><Link to="login">Login</Link></a></li>
                            <li><a><Link to="segundaaula/2">2ª</Link></a></li>
                            <li><a><Link to="terceiraaula/3">3ª</Link></a></li>
                            <li><a><Link to="quartaaula/4">4ª</Link></a></li>
                            <li><a><Link to="quintaaula/5">5ª</Link></a></li>
                            <li><a><Link to="setimaaula/7">7ª</Link></a></li>
                            <li><a><Link to="oitavaaula/8">8ª</Link></a></li>
                            <li><a><Link to="decimaterceiraaula/13">13ª</Link></a></li>
                            <li><a><Link to="decimaquartaaula/14">14ª</Link></a></li>
                            <li><a><Link to="decimaquintaaula/15">15ª</Link></a></li>
                        </ul>

                    </nav>
                </div>
            </header>

            <main>

                <Outlet />

            </main>

        </body>






    )
}