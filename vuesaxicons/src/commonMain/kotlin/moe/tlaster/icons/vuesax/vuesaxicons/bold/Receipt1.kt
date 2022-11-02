package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Receipt1: ImageVector
    get() {
        if (_receipt1 != null) {
            return _receipt1!!
        }
        _receipt1 = Builder(name = "Receipt1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.78f, 2.0f)
                horizontalLineTo(8.22f)
                curveTo(4.44f, 2.0f, 3.5f, 3.01f, 3.5f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.96f, 4.96f, 21.59f, 6.73f, 19.69f)
                lineTo(6.74f, 19.68f)
                curveTo(7.56f, 18.81f, 8.81f, 18.88f, 9.52f, 19.83f)
                lineTo(10.53f, 21.18f)
                curveTo(11.34f, 22.25f, 12.65f, 22.25f, 13.46f, 21.18f)
                lineTo(14.47f, 19.83f)
                curveTo(15.19f, 18.87f, 16.44f, 18.8f, 17.26f, 19.68f)
                curveTo(19.04f, 21.58f, 20.49f, 20.95f, 20.49f, 18.29f)
                verticalLineTo(7.04f)
                curveTo(20.5f, 3.01f, 19.56f, 2.0f, 15.78f, 2.0f)
                close()
                moveTo(15.0f, 11.75f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 11.75f, 8.25f, 11.41f, 8.25f, 11.0f)
                curveTo(8.25f, 10.59f, 8.59f, 10.25f, 9.0f, 10.25f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 10.25f, 15.75f, 10.59f, 15.75f, 11.0f)
                curveTo(15.75f, 11.41f, 15.41f, 11.75f, 15.0f, 11.75f)
                close()
                moveTo(16.0f, 7.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 7.75f, 7.25f, 7.41f, 7.25f, 7.0f)
                curveTo(7.25f, 6.59f, 7.59f, 6.25f, 8.0f, 6.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 6.25f, 16.75f, 6.59f, 16.75f, 7.0f)
                curveTo(16.75f, 7.41f, 16.41f, 7.75f, 16.0f, 7.75f)
                close()
            }
        }
        .build()
        return _receipt1!!
    }

private var _receipt1: ImageVector? = null
