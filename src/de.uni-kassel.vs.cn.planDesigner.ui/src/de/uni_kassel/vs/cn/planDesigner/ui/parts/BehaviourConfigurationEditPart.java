// Copyright 2009 Distributed Systems Group, University of Kassel
// This program is distributed under the GNU Lesser General Public License (LGPL).
//
// This file is part of the Carpe Noctem Software Framework.
//
//    The Carpe Noctem Software Framework is free software: you can redistribute it and/or modify
//    it under the terms of the GNU Lesser General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    The Carpe Noctem Software Framework is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU Lesser General Public License for more details.
package de.uni_kassel.vs.cn.planDesigner.ui.parts;

import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Notification;

import de.uni_kassel.vs.cn.planDesigner.ui.PlanDesignerActivator;
import de.uni_kassel.vs.cn.planDesigner.ui.util.PlanDesignerConstants;

public class BehaviourConfigurationEditPart extends AbstractPlanStateEditPart {
	
	@Override
	protected Label createNameLabel() {
		Label l = new Label(getPlanElement().getName());;
		
		PlanDesignerActivator plugin = PlanDesignerActivator.getDefault();
		
		l.setIcon(plugin.getImageRegistry().get(PlanDesignerConstants.ICON_BEHAVIOUR_CONFIGURATION_16));
		
		return l;
	}
	
	@Override
	protected void handleModelChanged(Notification n) {
		super.handleModelChanged(n);
	}

}
