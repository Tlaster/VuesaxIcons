package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Lampslash: ImageVector
    get() {
        if (_lampslash != null) {
            return _lampslash!!
        }
        _lampslash = Builder(name = "Lampslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0299f, 2.48f)
                lineTo(4.1799f, 18.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.2501f, 12.9999f)
                curveTo(4.8301f, 12.0299f, 4.5801f, 10.9799f, 4.5801f, 9.8999f)
                curveTo(4.5801f, 4.9899f, 8.8001f, 1.1199f, 13.6001f, 2.1699f)
                curveTo(15.0601f, 2.4899f, 16.3601f, 3.2699f, 17.3601f, 4.3499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0599f, 7.3f)
                curveTo(20.2799f, 11.18f, 18.3099f, 15.08f, 15.5199f, 16.87f)
                verticalLineTo(18.03f)
                curveTo(15.5199f, 18.32f, 15.6199f, 18.99f, 14.6199f, 18.99f)
                horizontalLineTo(9.4199f)
                curveTo(8.3899f, 18.99f, 8.5199f, 18.56f, 8.5199f, 18.03f)
                verticalLineTo(16.87f)
                curveTo(8.0399f, 16.57f, 7.5899f, 16.2f, 7.1599f, 15.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 22.0f)
                curveTo(10.79f, 21.35f, 13.21f, 21.35f, 15.5f, 22.0f)
            }
        }
        .build()
        return _lampslash!!
    }

private var _lampslash: ImageVector? = null
