import { useParams } from 'react-router-dom'
import './style.scss'

export function SegundaAula () {

    const { id } = useParams

    return (
    <main>
        <div className='sino'>
            <h3>Terceiro Componente</h3>
            <img src="https://cdn-icons-png.flaticon.com/512/4418/4418877.png" alt="" width="30" height="30"/>
            <p className='sininho'>Ícone Sininho</p>
        </div>

        <h1>Segunda Aula</h1>       
        
        <h2>Projeto escolhido: YouTube</h2>
        <ul className='primeiroComponente'>
            <li className='button'>
                <h3>Primeiro Componente</h3>
                <div className='retangulo'>
                    <p>Filtro</p>
                </div>
            </li>
            <li className='button'>
                <h3>Primeiro Componente</h3>
                <div className='retangulo'>
                    <p>Filtro</p>
                </div>
            </li>
            <li className='button'>
                <h3>Primeiro Componente</h3>
                <div className='retangulo'>
                    <p>Filtro</p>
                </div>
            </li>
            <li className='button'>
                <h3>Primeiro Componente</h3>
                <div className='retangulo'>
                    <p>Filtro</p>
                </div>
            </li>
            <li className='button'>
                <h3>Primeiro Componente</h3>
                <div className='retangulo'>
                    <p>Filtro</p>
                </div>
            </li>
            <li className='button'>
                <h3>Primeiro Componente</h3>
                <div className='retangulo'>
                    <p>Filtro</p>
                </div>
            </li>
        
        </ul>
        
        <ul className='segundoComponente'>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>         
        </ul>

        <ul className='segundoComponente'>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>
            <li className='card'>
                <h3>Segundo Componente</h3>
                <div className='quadrado'>
                </div>
                <p>Título do card</p>
            </li>         
        </ul>
    </main>
    )
}