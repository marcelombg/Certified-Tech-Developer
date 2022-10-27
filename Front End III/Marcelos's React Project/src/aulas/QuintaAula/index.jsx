import './style.scss'
import youtubeimage from "./../../assets/images/youtube_home.png"
import youtubelogo from "./../../assets/images/youtube-logo.png"
import { QuintaAulaItem } from '../../components/QuintaAulaItem'
import { QuintaAulaItem2 } from '../../components/QuintaAulaItem'

export function QuintaAula () {

    const componentsFinded = [
        {
            id: 1,
            title: 'Vídeo 1',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit.",
            link: 'https://www.youtube.com/',
            image2: youtubelogo
        },
        {
            id: 2,
            title: 'Vídeo 2',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit.",
            link: 'https://www.youtube.com/',
            image2: youtubelogo
        },
        {
            id: 3,
            title: 'Vídeo 3',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit.",
            link: 'https://www.youtube.com/',
            image2: youtubelogo
        },
        {
            id: 4,
            title: 'Vídeo 4',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit.",
            link: 'https://www.youtube.com/',
            image2: youtubelogo
        },
        {
            id: 5,
            title: 'Vídeo 5',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit.",
            link: 'https://www.youtube.com/',
            image2: youtubelogo
        },
        {
            id: 6,
            title: 'Vídeo 6',
            image: youtubeimage,
            text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit.",
            link: 'https://www.youtube.com/',
            image2: youtubelogo
        }
    ]

    return (
        <div className='quarta-aula-component'>
            <h1 className='main-title'>Componentes identificados</h1>
            <ul className='components-finded'>
                {componentsFinded.map(item => 
                <QuintaAulaItem key={item.id} component={item}/>
                )}
            </ul>
            <div>
                <QuintaAulaItem2/>
            </div>
        </div>
    )
}