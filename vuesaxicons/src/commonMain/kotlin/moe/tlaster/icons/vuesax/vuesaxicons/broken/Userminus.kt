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

public val BrokenGroup.Userminus: ImageVector
    get() {
        if (_userminus != null) {
            return _userminus!!
        }
        _userminus = Builder(name = "Userminus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.02f, 3.01f)
                curveTo(14.18f, 2.37f, 13.14f, 2.0f, 12.0f, 2.0f)
                curveTo(9.24f, 2.0f, 7.0f, 4.24f, 7.0f, 7.0f)
                curveTo(7.0f, 9.76f, 9.24f, 12.0f, 12.0f, 12.0f)
                curveTo(14.76f, 12.0f, 17.0f, 9.76f, 17.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4102f, 22.0f)
                curveTo(3.4102f, 18.13f, 7.2602f, 15.0f, 12.0002f, 15.0f)
                curveTo(12.9602f, 15.0f, 13.8902f, 15.13f, 14.7602f, 15.37f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                curveTo(22.0f, 18.32f, 21.96f, 18.63f, 21.88f, 18.93f)
                curveTo(21.79f, 19.33f, 21.63f, 19.72f, 21.42f, 20.06f)
                curveTo(20.73f, 21.22f, 19.46f, 22.0f, 18.0f, 22.0f)
                curveTo(16.97f, 22.0f, 16.04f, 21.61f, 15.34f, 20.97f)
                curveTo(15.04f, 20.71f, 14.78f, 20.4f, 14.58f, 20.06f)
                curveTo(14.21f, 19.46f, 14.0f, 18.75f, 14.0f, 18.0f)
                curveTo(14.0f, 16.92f, 14.43f, 15.93f, 15.13f, 15.21f)
                curveTo(15.86f, 14.46f, 16.88f, 14.0f, 18.0f, 14.0f)
                curveTo(19.18f, 14.0f, 20.25f, 14.51f, 20.97f, 15.33f)
                curveTo(21.61f, 16.04f, 22.0f, 16.98f, 22.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.4897f, 17.98f)
                horizontalLineTo(16.5098f)
            }
        }
        .build()
        return _userminus!!
    }

private var _userminus: ImageVector? = null
