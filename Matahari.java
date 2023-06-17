class Matahari extends Plants implements Treatment {
    private static final double PERKEMBANGAN_TAMBAHAN = 0.1;

    public Matahari() {
        super(30, 70, 0.3);
    }

    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbunga(getProsesBerbunga() + getPerkembangan());
        if (getProsesBerbunga() >= getMahkotaBunga()) {
            setMahkotaBunga(getMahkotaBunga() + 1);
            if (getProsesBerbunga() == getMahkotaBunga()) {
                setProsesBerbunga(0);
            } else if (getProsesBerbunga() > getMahkotaBunga()) {
                setProsesBerbunga(getProsesBerbunga() - getMahkotaBunga());
            }
        }
    }

    private void setProsesBerbunga(int i) {
    }

    private int getPerkembangan() {
        return 0;
    }

    private int getProsesBerbunga() {
        return 0;
    }

    public void treatment() {
        setPerkembangan(getPerkembangan() + PERKEMBANGAN_TAMBAHAN);
    }

    private void setPerkembangan(double d) {
    }

    public String toString() {
        return "Matahari\n" + super.toString();
    }
}