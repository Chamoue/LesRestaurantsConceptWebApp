package universconception.conception.cegepstefoy.restaurantconcept.Data;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

public class RestoRepository {
    private ClientDAO m_restoDAO;
    private LiveData<Object> mData;

    public RestoRepository(Application application) {
        RoomDatabase db = RoomDatabase.getDatabase(application);
        this.m_restoDAO = db.restoDAO();
        //this.mData = m_restoDAO.g;
    }

    public void insert (Object object) {
        new InsertTask(m_restoDAO).execute(object);
    }

    public class InsertTask extends AsyncTask<Object, Void, Void> {
        private ClientDAO mAsyncTaskDao;

        InsertTask(ClientDAO dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(Object... objects) {
            return null;
        }
    }
}
