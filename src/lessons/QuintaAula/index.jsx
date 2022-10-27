import './style.scss'
import youtubeImage from './../../assets/images/youtube-home.png'
import batataGif from './../../assets/images/batata.gif'
import { QuintaAulaItem } from './../../components/QuintaAulaItem'

export function QuintaAula() {

    const componentsFinded = [
        {
            id: 1,
            title: 'Vídeo Component',
            image: youtubeImage,
            text: 'Lorem ipsum, dolor sit amet consectetur.'
        },
        {
            id: 2,
            title: 'Input Component',
            image: batataGif,
            text: 'Lorem ipsum, dolor sit amet consectetur.'
        },
        {
            id: 3,
            title: 'Button Component',
            image: batataGif,
            text: 'Lorem ipsum, dolor sit amet consectetur.'
        }
    ]

    return (
        <div className='quarta-aula-component'>

            <h1 className='main-title'>Componentes identificados</h1>

            <ul className='components-finded'>

                {
                    componentsFinded.map(
                        component => {
                            return (
                                <QuintaAulaItem
                                    key={component.id}
                                    item={component}
                                />
                            )
                        }
                    )
                }

            </ul>

        </div>
    )

}