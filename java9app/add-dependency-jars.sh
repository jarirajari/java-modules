#!/bin/bash
jar --file ~/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar --describe-module
cp -v ~/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar java_mods/
jar --file ~/.m2/repository/javax/mail/mail/1.5.0-b01/mail-1.5.0-b01.jar --describe-module
cp -v ~/.m2/repository/javax/mail/mail/1.5.0-b01/mail-1.5.0-b01.jar java_mods/

