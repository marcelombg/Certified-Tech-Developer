import { useState } from "react"
import { createContext, useContext } from "react"

// Ciração do Contexto
const LetterContext = createContext()

// Criação do Provedor para o Contexto
export function LetterProvider(props) {

    const letterLocalStorage = localStorage.getItem('letter')
    // State que irá controlar qual Tema a aplicação está usando
    const [letter, setLetter] = useState(letterLocalStorage === null || letterLocalStorage === false ? 'default' : letterLocalStorage)

    // Função responsável por Trocar o Tema
    function changeLetter(letterRecieved) {

        if(letterRecieved !== letter) {

            setLetter('bigLetter')
            localStorage.setItem('letter', letterRecieved)

        } else {
            setLetter('default')
            localStorage.setItem('letter', letterRecieved)
        }

    }

    return(

        // Construção dos Elementos para utilizarmos o Contexto em nossa Aplicação, tudo o que for contido no "value" será exportado e poderá ser utilizado em Componentes que utilizarem o Hook Customizado "useTheme"
        <LetterContext.Provider value={{letter, changeLetter}}>
            { props.children }
        </LetterContext.Provider>

    )

}

// Hook Personalizado que irá ser utilizado quando quisermos utilizar alguma das Funcionalidades contidas em nosso Contexto
export function useLetter() {

    const context = useContext(LetterContext)

    return context

}