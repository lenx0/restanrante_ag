import './styles.css';
import { ReactComponent as Logo} from './logo.svg';

function Navbar(){
    return(
        <nav className="main-navbar">
            <Logo />
            <a href="home" className="logo-text">RESTAURANTE AG</a>
            <Logo />
        </nav>
    )
}

export default Navbar;