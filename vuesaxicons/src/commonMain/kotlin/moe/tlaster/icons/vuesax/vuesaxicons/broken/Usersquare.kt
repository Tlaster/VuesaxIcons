package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Usersquare: ImageVector
    get() {
        if (_usersquare != null) {
            return _usersquare!!
        }
        _usersquare = Builder(name = "Usersquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.1394f, 21.62f)
                curveTo(17.2594f, 21.88f, 16.2194f, 22.0f, 14.9994f, 22.0f)
                horizontalLineTo(8.9994f)
                curveTo(7.7794f, 22.0f, 6.7394f, 21.88f, 5.8594f, 21.62f)
                curveTo(6.0794f, 19.02f, 8.7494f, 16.97f, 11.9994f, 16.97f)
                curveTo(15.2494f, 16.97f, 17.9194f, 19.02f, 18.1394f, 21.62f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.94f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 18.78f, 3.14f, 20.85f, 5.86f, 21.62f)
                curveTo(6.08f, 19.02f, 8.75f, 16.97f, 12.0f, 16.97f)
                curveTo(15.25f, 16.97f, 17.92f, 19.02f, 18.14f, 21.62f)
                curveTo(20.86f, 20.85f, 22.0f, 18.78f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(12.94f)
                close()
                moveTo(12.0f, 14.17f)
                curveTo(10.02f, 14.17f, 8.42f, 12.56f, 8.42f, 10.58f)
                curveTo(8.42f, 8.6f, 10.02f, 7.0f, 12.0f, 7.0f)
                curveTo(13.98f, 7.0f, 15.58f, 8.6f, 15.58f, 10.58f)
                curveTo(15.58f, 12.56f, 13.98f, 14.17f, 12.0f, 14.17f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5799f, 10.58f)
                curveTo(15.5799f, 12.56f, 13.9799f, 14.17f, 11.9999f, 14.17f)
                curveTo(10.0199f, 14.17f, 8.4199f, 12.56f, 8.4199f, 10.58f)
                curveTo(8.4199f, 8.6f, 10.0199f, 7.0f, 11.9999f, 7.0f)
                curveTo(13.9799f, 7.0f, 15.5799f, 8.6f, 15.5799f, 10.58f)
                close()
            }
        }
        .build()
        return _usersquare!!
    }

private var _usersquare: ImageVector? = null
