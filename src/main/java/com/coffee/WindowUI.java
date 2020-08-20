package com.coffee;

import com.intellij.openapi.Disposable;
import com.intellij.openapi.actionSystem.DataProvider;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import org.gitlab4j.api.GitLabApi;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class WindowUI extends SimpleToolWindowPanel  implements DataProvider, Disposable {
    private JButton button1;
    private JPanel myContentPanel;
    public WindowUI() {
        super(true, true);
    }
    public void init(@NotNull final Project project, final boolean isToolwindow){

        GitLabApi gitlabApi = new GitLabApi("","");
        setContent(myContentPanel);

    }

    @Override
    public void dispose() {

    }
}
