package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Folderminus: ImageVector
    get() {
        if (_folderminus != null) {
            return _folderminus!!
        }
        _folderminus = Builder(name = "Folderminus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4297f, 15.3f)
                horizontalLineTo(9.4297f)
                curveTo(9.0197f, 15.3f, 8.6797f, 14.96f, 8.6797f, 14.55f)
                curveTo(8.6797f, 14.14f, 9.0197f, 13.8f, 9.4297f, 13.8f)
                horizontalLineTo(14.4297f)
                curveTo(14.8397f, 13.8f, 15.1797f, 14.14f, 15.1797f, 14.55f)
                curveTo(15.1797f, 14.96f, 14.8397f, 15.3f, 14.4297f, 15.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.75f)
                horizontalLineTo(7.0f)
                curveTo(2.59f, 22.75f, 1.25f, 21.41f, 1.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(1.25f, 2.59f, 2.59f, 1.25f, 7.0f, 1.25f)
                horizontalLineTo(8.5f)
                curveTo(10.25f, 1.25f, 10.8f, 1.82f, 11.5f, 2.75f)
                lineTo(13.0f, 4.75f)
                curveTo(13.33f, 5.19f, 13.38f, 5.25f, 14.0f, 5.25f)
                horizontalLineTo(17.0f)
                curveTo(21.41f, 5.25f, 22.75f, 6.59f, 22.75f, 11.0f)
                verticalLineTo(17.0f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17.0f, 22.75f)
                close()
                moveTo(7.0f, 2.75f)
                curveTo(3.42f, 2.75f, 2.75f, 3.43f, 2.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.75f, 20.57f, 3.42f, 21.25f, 7.0f, 21.25f)
                horizontalLineTo(17.0f)
                curveTo(20.58f, 21.25f, 21.25f, 20.57f, 21.25f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(21.25f, 7.43f, 20.58f, 6.75f, 17.0f, 6.75f)
                horizontalLineTo(14.0f)
                curveTo(12.72f, 6.75f, 12.3f, 6.31f, 11.8f, 5.65f)
                lineTo(10.3f, 3.65f)
                curveTo(9.78f, 2.96f, 9.62f, 2.75f, 8.5f, 2.75f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _folderminus!!
    }

private var _folderminus: ImageVector? = null
