package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Routing2: ImageVector
    get() {
        if (_routing2 != null) {
            return _routing2!!
        }
        _routing2 = Builder(name = "Routing2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.47f, 9.0f)
                curveTo(7.403f, 9.0f, 8.97f, 7.433f, 8.97f, 5.5f)
                curveTo(8.97f, 3.567f, 7.403f, 2.0f, 5.47f, 2.0f)
                curveTo(3.537f, 2.0f, 1.97f, 3.567f, 1.97f, 5.5f)
                curveTo(1.97f, 7.433f, 3.537f, 9.0f, 5.47f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.97f, 15.0f)
                horizontalLineTo(19.97f)
                curveTo(21.07f, 15.0f, 21.97f, 15.9f, 21.97f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(21.97f, 21.1f, 21.07f, 22.0f, 19.97f, 22.0f)
                horizontalLineTo(16.97f)
                curveTo(15.87f, 22.0f, 14.97f, 21.1f, 14.97f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(14.97f, 15.9f, 15.87f, 15.0f, 16.97f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9999f, 5.0f)
                horizontalLineTo(14.6799f)
                curveTo(16.5299f, 5.0f, 17.3899f, 7.29f, 15.9999f, 8.51f)
                lineTo(8.0099f, 15.5f)
                curveTo(6.6199f, 16.71f, 7.4799f, 19.0f, 9.3199f, 19.0f)
                horizontalLineTo(11.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4862f, 5.5f)
                horizontalLineTo(5.4978f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4862f, 18.5f)
                horizontalLineTo(18.4978f)
            }
        }
        .build()
        return _routing2!!
    }

private var _routing2: ImageVector? = null
