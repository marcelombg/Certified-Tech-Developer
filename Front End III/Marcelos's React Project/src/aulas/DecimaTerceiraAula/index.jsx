import { useState, useEffect } from 'react'
import './style.scss'

export function DecimaTerceiraAula () {

    const [contador, setContador] = useState('')
    const [botao, setBotao] = useState(false)

    function cancelarPedido() {
        if(setBotao){
            alert('Pedido cancelado')
            setContador('')
        } 
    }

    function contar(){
        if (contador.length > 0) {
            setTimeout(() => {alert('Componente atualizado')}, 5000); 
        }

    }

    useEffect(() => 
    {
        contar()
    }, []
    )

    return (
        <>
        <h1>Seu pedido:</h1>
        <input type="text" value={contador} onChange={(event) => setContador(event.target.value)}/>
        <div>
        <button value={botao} onClick={() => contar()}>Enviar pedido</button>
            <button value={botao} onClick={() => cancelarPedido()}>Cancelar pedido</button>
        </div>
        </>
    )
}
