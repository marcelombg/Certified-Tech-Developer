import { useState, useEffect } from 'react'
import './style.scss'

export function DecimaTerceiraAula () {

    const [texto, setTexto] = useState('')
    const [botao, setBotao] = useState(false)

    function cancelarPedido() {
        if(setBotao){
            alert('Pedido cancelado')
            setTexto('')
        } 
    }

    function contador(){
        if (texto.length > 0) {
            setTimeout(() => {alert('Pedido enviado - Componente atualizado'), setTexto('')}, 3000);
        }

    }

    useEffect(() => 
    {
        contador()
    }, []
    )

    return (
        <>
        <h1>Digite seu pedido:</h1>
        <input type="text" value={texto} onChange={(event) => setTexto(event.target.value)}/>
        <div>
            <button id='enviar' value={texto} onClick={() => contador()}>Enviar pedido</button>
            <button id='cancelar' value={botao} onClick={() => cancelarPedido()}>Cancelar pedido</button>
        </div>
        </>
    )
}
