# Listener Interfaces.  
  
  
>Jafet Anselmo Sena Ramos 3 A ISC. - No. de Control 20100264.
## Action Listener  
### Interfaz oyente para recibir eventos de acción.
| Método | Descripción |  
| ------ | ----------- |  
| **actionPerformed(ActionEvent e)** | Ejecuta el código cuando se realiza la acción en el control visual. |  
  
  ## Key Listener  
  ### Interfaz oyente para recibir eventos del teclado. 
| Método | Descripción |  
| ------ | ----------- | 
| **keyPressed(KeyEvent e)** | Invocado cuando el usuario presiona cualquier tecla. |  
| **keyReleased(KeyEvent e)** | Invocado cuando se ha dejado de pulsar la tecla. |  
| **keyTyped(KeyEvent e)** | Es lo misma función del método keyPressed, la única diferencia, es que el método solo funciona cuando se presionan teclas que no son de acción (es decir: teclas como end, alt, f6, entre otras. No son reconocidas por este método). |  
  
## Focus Listener  
### Interfaz oyente para recibir eventos de foco de teclado en un componente.
| Métodos | Descripción |
| ------- | ----------- |  
| **focusGained(FocusEvent e)** | Se invoca cuando un componente gana el foco del teclado. |  
| **focusLost(FocusEvent e)** | Se invoca cuando un componente pierde el foco del teclado. |
## Mouse Listener 
### Interfaz oyente para recibir eventos del ratón  "interesantes" (presionar, soltar, hacer clic, ingresar y salir) en un componente.
| Métodos | Descripción |
| ------- | ----------- |  
| **mouseClicked(MouseEvent e)** | Se activa cuando se presiona y dejas de presionar el botón, sin mover el mouse. |  
| **mouseEntered(MouseEvent e)** | Cuando se encuentra dentro del área de un componente, este método se invoca. |  
| **mouseExited(MouseEvent e)** | Se lanza cuando el cursor sale del área de un componente. |  
| **mousePressed(MouseEvent e)** | Se activa cuando el botón del mouse se mantiene presionado. |  
| **mouseReleased(MouseEvent e)** | Cuando el botón del mouse deja de ser presionado, se invoca el método. |
## Window Listener  
### Interfaz oyente para recibir eventos de ventana.
| Métodos | Descripción |
| ------- | ----------- |  
| **windowActivated(WindowEvent e)** | Este método se activa cuando la ventana tiene el foco, con esto se refiere a cuando la ventana esta sobre todas las demás. |  
| **windowClosed(WindowEvent e)** | Se activa cuando la ventana se ha cerrado. |  
| **windowClosing(WindowEvent e)** | Cuando usted cierra la ventana presionando el botón de cerrar este método se activa. Por lo que, para aprovechar este método primero debe desactivar la función del botón cerrar. |  
| **windowDeactivated(WindowEvent e)** | Funciona de manera contraria al método anterior, cuando la ventana no esta activa (no tiene el foco o no se esta trabajando sobre esta) se invoca el método. |
| **windowIconified(WindowEvent e)** | Al minimizar (ocultar) la ventana, esta función se invoca. |  
| **windowDeiconified(WindowEvent e)** | Lo contrario al método anterior, cuando la ventana se encuentra minimizada y es maximizada se invoca el método. |  
| **windowOpened(WindowEvent e)** | Es llamado cuando la ventana se ejecuta (abre) por primera vez. |
## Adjustment Listener  
### Interfaz oyente para recibir eventos de ajuste.
| Métodos | Descripción |
| ------- | ----------- |  
| **adjustmentValueChanged(AdjustementEvent e)** | Se invoca el método cuando el valor de un componente ajustable ha cambiado. |
## Component Listener  
### Interfaz oyente para recibir eventos de componentes.
| Métodos | Descripción |
| ------- | ----------- |  
| **componentHidden(ComponentEvent e)** | Se invoca el método cuando el componente se hace invisible. |  
| **componentMoved(ComponentEvent e)** | Se invoca el método cuando la posición del componente cambia. |  
| **componentResized(ComponentEvent e)** | Se invoca el método cuando el tamaño del componente cambia. |  
| **componentShown(ComponentEvent e)** | Se invoca el método cuando el componente se hace visible. |
## Container Listener  
### Interfaz oyente para recibir eventos de un contenedor.
| Métodos | Descripción |
| ------- | ----------- |  
| **componentAdded(ContainerEvent e)** | Se invoca cuando se ha añadido un componente al contenedor. |  
| **componentRemoved(ContainerEvent e)** | Se invoca cuando un componente ha sido retirado del contenedor. |
## Item Listener  
### Interfaz oyente para recibir eventos de elementos.
| Métodos | Descripción |
| ------- | ----------- |  
| **itemStateChanged(ItemEvent e)** | Se invoca cuando un elemento de un componente ha sido seleccionado o deseleccionado por el usuario. |
## Mouse Motion Listener  
### Interfaz oyente para recibir eventos de movimiento del ratón en un componente.
| Métodos | Descripción |
| ------- | ----------- |  
| **mouseDragged(MouseEvent e)** | Cuando mantienes presionado el botón del mouse y lo mueves, se activa el método. |  
| **mouseMoved(MouseEvent e)** | Este método se invoca cuando el cursor (mouse) se mueve. |
## Text Listener  
### Interfaz oyente para recibir eventos de texto.
| Métodos | Descripción |
| ------- | ----------- |  
| **textValueChanged(TextEvent e)** | Se invoca el método cuando el valor del texto ha cambiado. |