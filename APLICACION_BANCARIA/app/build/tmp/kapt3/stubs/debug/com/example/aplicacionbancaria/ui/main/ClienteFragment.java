package com.example.aplicacionbancaria.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/aplicacionbancaria/ui/main/ClienteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/aplicacionbancaria/BancoAdapter;", "binding", "Lcom/example/aplicacionbancaria/databinding/FragmentClienteBinding;", "clienteList", "Ljava/util/ArrayList;", "Lcom/example/aplicacionbancaria/Cliente;", "Lkotlin/collections/ArrayList;", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ClienteFragment extends androidx.fragment.app.Fragment {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private java.util.ArrayList<com.example.aplicacionbancaria.Cliente> clienteList;
    private com.example.aplicacionbancaria.BancoAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private com.google.firebase.firestore.FirebaseFirestore db;
    private com.example.aplicacionbancaria.databinding.FragmentClienteBinding binding;
    
    public ClienteFragment() {
        super();
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}