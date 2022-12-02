import './style.scss'

import { useEffect } from "react"
import { useTheme } from "../../hooks/useTheme"
import { contents } from '../../assets/translate/contents'
import { useLanguage } from '../../hooks/useLanguage'
import { useLetter } from '../../hooks/useLetter'

export function Configurations() {

    // Utilização do Hook useTheme
    const { theme, changeTheme } = useTheme()
    const { letter, changeLetter} = useLetter()
    const { currentLanguage, changeCurrentLanguage } = useLanguage()

    // contents['configurationComponent']

    return (

        <div className='configurations-component'>

            <h1>{contents.configurationComponent.title[currentLanguage]}</h1>

            <form>

                <section>

                    <h1>{contents.configurationComponent.sectionTitleTheme[currentLanguage]}</h1>

                    <div>
                        <input type="radio" name="theme" id="light" checked={theme === 'light'} onChange={() => changeTheme('light')} />
                        <label htmlFor="light"> Claro</label>
                    </div>

                    <div>
                        <input type="radio" name="theme" id="dark" checked={theme === 'dark'} onChange={() => changeTheme('dark')} />
                        <label htmlFor="dark"> Escuro</label>
                    </div>

                    <div>
                        <input type="radio" name="theme" id="contrast" checked={theme === 'contrast'} onChange={() => changeTheme('contrast')} />
                        <label htmlFor="contrast"> Alto Contraste</label>
                    </div>

                </section>

                <section>

                    <h1>Acessibilidade</h1>

                    <div>
                        <label htmlFor='bigLetter'>Letras grandes </label>
                        <input type="checkbox" name='bigLetter' id='bigLetter' checked={letter === 'bigLetter'} onChange={() => changeLetter('bigLetter')} />
                    </div>

                </section>

                <section>

                    <h1>Linguagem</h1>

                    <div>
                        <label htmlFor="language">Linguagem </label>
                        <select
                            id="language"
                            onChange={event => changeCurrentLanguage(event.target.value)}
                            value={currentLanguage}
                        >
                            <option value="portuguese">Portugues</option>
                            <option value="english">English</option>
                            <option value="russian">Russo</option>
                        </select>
                    </div>

                </section>

            </form>

        </div>

    )

}