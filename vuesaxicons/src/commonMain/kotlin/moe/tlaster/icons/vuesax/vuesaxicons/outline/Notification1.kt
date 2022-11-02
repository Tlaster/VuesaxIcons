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

public val OutlineGroup.Notification1: ImageVector
    get() {
        if (_notification1 != null) {
            return _notification1!!
        }
        _notification1 = Builder(name = "Notification1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.75f)
                curveTo(16.93f, 8.75f, 15.25f, 7.07f, 15.25f, 5.0f)
                curveTo(15.25f, 2.93f, 16.93f, 1.25f, 19.0f, 1.25f)
                curveTo(21.07f, 1.25f, 22.75f, 2.93f, 22.75f, 5.0f)
                curveTo(22.75f, 7.07f, 21.07f, 8.75f, 19.0f, 8.75f)
                close()
                moveTo(19.0f, 2.75f)
                curveTo(17.76f, 2.75f, 16.75f, 3.76f, 16.75f, 5.0f)
                curveTo(16.75f, 6.24f, 17.76f, 7.25f, 19.0f, 7.25f)
                curveTo(20.24f, 7.25f, 21.25f, 6.24f, 21.25f, 5.0f)
                curveTo(21.25f, 3.76f, 20.24f, 2.75f, 19.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2.0f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14.0f, 2.75f)
                horizontalLineTo(9.0f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22.0f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
            }
        }
        .build()
        return _notification1!!
    }

private var _notification1: ImageVector? = null
