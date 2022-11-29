import './style.scss'

import { useEffect } from "react"
import { useTheme } from "../../hooks/useTheme"
import { contents } from '../../assets/translate/contents'
import { useLanguage } from '../../hooks/useLanguage'

export function Configurations() {

    // Utilização do Hook useTheme
    const { theme, changeTheme } = useTheme()
    const { currentLanguage, changeCurrentLanguage } = useLanguage()

    // contents['configurationComponent']

    return (

        <div className='configurations-component'>

            <h1>{contents.configurationComponent.title[currentLanguage]}</h1>

            <form>

                <section>

                    <h1>{contents.configurationComponent.sectionTitleTheme[currentLanguage]}</h1>

                    <div>
                        <label htmlFor="light">Claro</label>
                        <input type="radio" name="theme" id="light" checked={theme === 'light'} onChange={() => changeTheme('light')} />
                    </div>

                    <div>
                        <label htmlFor="dark">Escuro</label>
                        <input type="radio" name="theme" id="dark" checked={theme === 'dark'} onChange={() => changeTheme('dark')} />
                    </div>

                </section>

                <section>

                    <h1>Linguagem</h1>

                    <div>
                        <label htmlFor="language">Linguagem</label>
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