#!/bin/sh

PATH=/home/pi/Public/jfx/jre/lib:/home/pi/Public/jfx/jre/lib/arm
PATH=$PATH:/home/pi/Public/MidiControllerVirtual
PATH=$PATH:/home/pi/Public/MidiControllerVirtual/lib
PATH=$PATH:/home/pi/Public/MidiControllerVirtual/lib/ext
PATH=$PATH:/home/pi/Public/MidiControllerVirtual/lib/config
PATH=$PATH:/home/pi/Public/MidiControllerVirtual/res
PATH=$PATH:/home/pi/Public/MidiControllerVirtual/res/i18n
PATH=$PATH:/home/pi/Public/MidiControllerVirtual/config/playlist
export PATH

MYCP=/home/pi/Public/MidiControllerVirtual/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/apache-log4j-2.10.0-bin/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/commons-beanutils-1.9.3/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/commons-configuration2-2.1.1/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/commons-io-2.5/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/commons-lang3-3.5/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/commons-logging-1.2/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/javazoom/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/oracle-java-tablelayout/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/jaudiotagger-2.2.6-SNAPSHOT.jar
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/ext/spring-framework-4.3.6.RELEASE/*
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/config
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/config/playlist
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/res
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/res/i18n
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/res/images
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/res/images/mp
MYCP=$MYCP:/home/pi/Public/MidiControllerVirtual/lib/patch/*

JAVAFX_DEBUG=1
/usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/bin/java -version
/usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/bin/java -cp "$MYCP" com.tntdjs.fxui.MidiFXApp