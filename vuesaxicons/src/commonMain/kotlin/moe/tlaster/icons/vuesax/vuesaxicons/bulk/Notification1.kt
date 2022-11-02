package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Notification1: ImageVector
    get() {
        if (_notification1 != null) {
            return _notification1!!
        }
        _notification1 = Builder(name = "Notification1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(20.6569f, 8.0f, 22.0f, 6.6568f, 22.0f, 5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                curveTo(17.3431f, 2.0f, 16.0f, 3.3431f, 16.0f, 5.0f)
                curveTo(16.0f, 6.6568f, 17.3431f, 8.0f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 9.5f)
                curveTo(16.52f, 9.5f, 14.5f, 7.48f, 14.5f, 5.0f)
                curveTo(14.5f, 4.28f, 14.69f, 3.61f, 14.99f, 3.0f)
                horizontalLineTo(7.52f)
                curveTo(4.07f, 3.0f, 2.0f, 5.06f, 2.0f, 8.52f)
                verticalLineTo(16.47f)
                curveTo(2.0f, 19.94f, 4.07f, 22.0f, 7.52f, 22.0f)
                horizontalLineTo(15.47f)
                curveTo(18.93f, 22.0f, 20.99f, 19.94f, 20.99f, 16.48f)
                verticalLineTo(9.01f)
                curveTo(20.39f, 9.31f, 19.72f, 9.5f, 19.0f, 9.5f)
                close()
            }
        }
        .build()
        return _notification1!!
    }

private var _notification1: ImageVector? = null
