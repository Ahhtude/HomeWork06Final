import java.util.*;
import java.util.function.UnaryOperator;


public class MyList extends ArrayList {


    @Override
    public boolean add(Object o)
    {
        if (isElementAlreadyPresented(o))
        {
            return false;
        }
        return super.add(o);

    }

    @Override
    public void add(int index, Object element)
    {
        if (isElementAlreadyPresented(element))
        {
            return;
        }
        super.add(index, element);
    }

    private boolean isElementAlreadyPresented(Object element)
    {
        for (Object elem : this)
        {
            if ((elem == null && element == null) || (elem != null && element != null && element.equals(elem)))
            {
                return true;
            }
        }
        return false;
    }

}