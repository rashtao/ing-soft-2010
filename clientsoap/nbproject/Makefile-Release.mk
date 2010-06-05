#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
CCADMIN=CCadmin
RANLIB=ranlib
CC=gcc
CCC=g++
CXX=g++
FC=gfortran
AS=as

# Macros
CND_PLATFORM=GNU-Linux-x86
CND_CONF=Release
CND_DISTDIR=dist

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=build/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/Presentation/PGroupList.o \
	${OBJECTDIR}/utility.o \
	${OBJECTDIR}/Presentation/PNewContact.o \
	${OBJECTDIR}/Presentation/PSearchContact.o \
	${OBJECTDIR}/Control/CGroup.o \
	${OBJECTDIR}/Presentation/PContactList.o \
	${OBJECTDIR}/main.o \
	${OBJECTDIR}/Presentation/PNewGroup.o \
	${OBJECTDIR}/Control/CContact.o

# C Compiler Flags
CFLAGS=

# CC Compiler Flags
CCFLAGS=
CXXFLAGS=

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	${MAKE}  -f nbproject/Makefile-Release.mk dist/Release/GNU-Linux-x86/clientsoap

dist/Release/GNU-Linux-x86/clientsoap: ${OBJECTFILES}
	${MKDIR} -p dist/Release/GNU-Linux-x86
	${LINK.cc} -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/clientsoap ${OBJECTFILES} ${LDLIBSOPTIONS} 

${OBJECTDIR}/Presentation/PGroupList.o: nbproject/Makefile-${CND_CONF}.mk Presentation/PGroupList.cpp 
	${MKDIR} -p ${OBJECTDIR}/Presentation
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Presentation/PGroupList.o Presentation/PGroupList.cpp

${OBJECTDIR}/utility.o: nbproject/Makefile-${CND_CONF}.mk utility.cpp 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/utility.o utility.cpp

${OBJECTDIR}/Presentation/PNewContact.o: nbproject/Makefile-${CND_CONF}.mk Presentation/PNewContact.cpp 
	${MKDIR} -p ${OBJECTDIR}/Presentation
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Presentation/PNewContact.o Presentation/PNewContact.cpp

${OBJECTDIR}/Presentation/PSearchContact.o: nbproject/Makefile-${CND_CONF}.mk Presentation/PSearchContact.cpp 
	${MKDIR} -p ${OBJECTDIR}/Presentation
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Presentation/PSearchContact.o Presentation/PSearchContact.cpp

${OBJECTDIR}/Control/CGroup.o: nbproject/Makefile-${CND_CONF}.mk Control/CGroup.cpp 
	${MKDIR} -p ${OBJECTDIR}/Control
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Control/CGroup.o Control/CGroup.cpp

${OBJECTDIR}/Presentation/PContactList.o: nbproject/Makefile-${CND_CONF}.mk Presentation/PContactList.cpp 
	${MKDIR} -p ${OBJECTDIR}/Presentation
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Presentation/PContactList.o Presentation/PContactList.cpp

${OBJECTDIR}/main.o: nbproject/Makefile-${CND_CONF}.mk main.cpp 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/main.o main.cpp

${OBJECTDIR}/Presentation/PNewGroup.o: nbproject/Makefile-${CND_CONF}.mk Presentation/PNewGroup.cpp 
	${MKDIR} -p ${OBJECTDIR}/Presentation
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Presentation/PNewGroup.o Presentation/PNewGroup.cpp

${OBJECTDIR}/Control/CContact.o: nbproject/Makefile-${CND_CONF}.mk Control/CContact.cpp 
	${MKDIR} -p ${OBJECTDIR}/Control
	${RM} $@.d
	$(COMPILE.cc) -O2 -MMD -MP -MF $@.d -o ${OBJECTDIR}/Control/CContact.o Control/CContact.cpp

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r build/Release
	${RM} dist/Release/GNU-Linux-x86/clientsoap

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc
