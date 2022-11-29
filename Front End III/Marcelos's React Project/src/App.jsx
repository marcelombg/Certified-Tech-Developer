import {
  createBrowserRouter,
  RouterProvider
} from "react-router-dom"

import { InstagramTimeLine } from './challenges/InstagramTimeLine'
import { QuartaAula } from './lessons/QuartaAula'
import { QuintaAula } from './lessons/QuintaAula'
import { SegundaAula } from "./lessons/SegundaAula"
import { TerceiraAula } from './lessons/TerceiraAula'
import { DHGames } from './pages/DHGames'
import { SetimaAula } from './lessons/SetimaAula'
import { DecimaTerceiraAula } from './lessons/DecimaTerceiraAula'
import { DecimaQuartaAula } from './lessons/DecimaQuartaAula'
import { DecimaQuintaAula } from './lessons/DecimaQuintaAula'
import { MainLayout } from "./components/MainLayout"
import { ToDo } from "./pages/ToDo"

import { ThemeProvider } from "./hooks/useTheme"
import { Configurations } from "./pages/Configurations"

function App() {

  const appRouter = createBrowserRouter([
    {
      path: '',
      element: <MainLayout />,
      children: [
        {
          path: 'segunda-aula',
          element: <SegundaAula />
        },
        {
          path: 'terceira-aula',
          element: <TerceiraAula />
        },
        {
          path: 'quarta-aula',
          element: <QuartaAula />
        },
        {
          path: 'quinta-aula',
          element: <QuintaAula />
        },
        {
          path: 'setima-aula',
          element: <SetimaAula />
        },
        {
          path: 'decima-terceira-aula',
          element: <DecimaTerceiraAula />
        },
        {
          path: 'decima-quarta-aula',
          element: <DecimaQuartaAula />
        },
        {
          path: 'decima-quinta-aula',
          element: <DecimaQuintaAula />
        },
        {
          path: 'configurations',
          element: <Configurations />
        },
        {
          path: 'to-do',
          element: <ToDo />
        }
      ]
    }
  ])

  return (
    <ThemeProvider>
      <RouterProvider router={appRouter} />
    </ThemeProvider>
  )

}

export default App