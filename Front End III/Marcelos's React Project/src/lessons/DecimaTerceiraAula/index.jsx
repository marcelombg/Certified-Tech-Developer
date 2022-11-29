import { useEffect, useState } from "react"

export function DecimaTerceiraAula() {

    const [contador, setContador] = useState(0)
    const [userName, setUserName] = useState('')
    const [userNameError, setUserNameError] = useState(false)
    const [errorForm, setErrorForm] = useState(false)

    function adicionarContador() {

        setContador(contador + 1)


    }

    function validar() {

        setErrorForm(!errorForm)

    }


    // ValidarNome
    useEffect(
        () => {

        }, []
    )

    return (
        <>
            { userNameError ? (<span>O campo Nome contém mais do que 10 caracteres</span>) : null }
        </>
    )

}