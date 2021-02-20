package harujisaku.javasaveimage.util;

import java.util.List;
import java.util.ArrayList;

public class Option extends ArrayList<String>{

  private IRunOption runOption = new IRunOption(){@Override public void runOption(Object[] obj){}};

  private OptionArgs[] optionArgs = new OptionArgs[]{OptionArgs.INTEGER};

  public Option(List<String> option){
    super(option);
  }

  public Option(String... option){
    super();
    for (String str : option ) {
      super.add(str);
    }
  }

  public void setRun(IRunOption runa){
    runOption=runa;
  }

  public void setMode(OptionArgs... optionMode){
    optionArgs=optionMode;
  }

  OptionArgs[] getMode(){
    return optionArgs;
  }

  void run(Object[] obj){
    runOption.runOption(obj);
  }

  public boolean add(String... options){
    for (String option :options ) {
      add(option);
    }
    return true;
  }
}
