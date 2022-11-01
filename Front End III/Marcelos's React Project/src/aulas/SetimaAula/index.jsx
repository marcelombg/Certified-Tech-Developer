import './style.scss'
import './../../components/SetimaAulaCardProduto'

export function SetimaAula () {

    let contador = 0

    return (

        <main className='setima-aula-component'>
            <h1>Contador</h1>
            <button onClick=''>Adicionar</button>
            <span>Número atual: {contador}</span>
        </main>

    )
}