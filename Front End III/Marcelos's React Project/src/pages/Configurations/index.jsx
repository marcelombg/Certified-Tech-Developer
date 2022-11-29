import { useTheme } from "../../hooks/useTheme"

export function Configurations() {

    // Utilização do Hook useTheme
    const { theme, changeTheme } = useTheme()

    return (

        <div>

            <h1>Configurações</h1>

            <form>

                <section>

                    <h1>Tema</h1>

                    <div>
                        <label htmlFor="light">Claro</label>
                        <input type="radio" name="theme" id="light" checked={theme === 'light'} onChange={() => changeTheme('light')} />
                    </div>

                    <div>
                        <label htmlFor="dark">Escuro</label>
                        <input type="radio" name="theme" id="dark" checked={theme === 'dark'} onChange={() => changeTheme('dark')} />
                    </div>

                </section>

            </form>

        </div>

    )

}