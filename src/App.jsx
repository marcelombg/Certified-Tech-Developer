import {
  createBrowserRouter,
  RouterProvider
} from "react-router-dom"

import { InstagramTimeLine } from './challenges/InstagramTimeLine'
import { QuartaAula } from './lessons/QuartaAula'
import { QuintaAula } from './lessons/QuintaAula'
import { TerceiraAula } from './lessons/TerceiraAula'
import { DHGames } from './pages/DHGames'
import { SetimaAula } from './lessons/SetimaAula'
import { DecimaTerceiraAula } from './lessons/DecimaTerceiraAula'
import { DecimaQuartaAula } from './lessons/DecimaQuartaAula'
import { DecimaQuintaAula } from './lessons/DecimaQuintaAula'
import { MainLayout } from "./components/MainLayout"
import { ToDo } from "./pages/ToDo"

function App() {

  const appRouter = createBrowserRouter([
    {
      path: '',
      element: <MainLayout />,
      children: [
        {
          path: 'decima-quarta-aula',
          element: <DecimaQuartaAula />
        },
        {
          path: 'decima-quinta-aula/:id',
          element: <DecimaQuintaAula />
        }
      ]
    },
    {
      path: 'to-do',
      element: <ToDo />
    }
  ])

  return (
    <RouterProvider router={appRouter} />
  )

}

export default App