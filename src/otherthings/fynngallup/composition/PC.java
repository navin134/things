package otherthings.fynngallup.composition;

public class PC {
    private TheCase theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(TheCase theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");

    }
//  Only useful if needing to check some kind of condition before accessing it otherwise just access directly
// this is becuase theres no point in using encapsulation practices if you dont have a need for them
 /*    private Case getTheCase() {
        return this.theCase;
    }

    private Monitor getMonitor() {
        return this.monitor;
    }

    private MotherBoard getMotherBoard() {
        return this.motherBoard;
    }
 */
}
