package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Js: ImageVector
    get() {
        if (_js != null) {
            return _js!!
        }
        _js = Builder(name = "Js", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.51f, 2.2701f)
                curveTo(11.81f, 2.1001f, 12.18f, 2.1001f, 12.48f, 2.2701f)
                lineTo(20.48f, 6.7101f)
                curveTo(20.8f, 6.8901f, 20.99f, 7.2201f, 20.99f, 7.5801f)
                verticalLineTo(16.4001f)
                curveTo(20.99f, 16.7601f, 20.79f, 17.1001f, 20.48f, 17.2701f)
                lineTo(12.48f, 21.7101f)
                curveTo(12.18f, 21.8801f, 11.81f, 21.8801f, 11.51f, 21.7101f)
                lineTo(10.0f, 21.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.9999f)
                lineTo(8.99f, 16.9299f)
                curveTo(8.99f, 18.4499f, 7.35f, 19.4199f, 6.02f, 18.6799f)
                lineTo(3.51f, 17.2899f)
                curveTo(3.19f, 17.1099f, 3.0f, 16.7799f, 3.0f, 16.4199f)
                verticalLineTo(7.5999f)
                curveTo(3.0f, 7.2399f, 3.2f, 6.8999f, 3.51f, 6.7299f)
                lineTo(7.21f, 4.6699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.75f)
                curveTo(17.0f, 9.78f, 16.22f, 9.0f, 15.25f, 9.0f)
                horizontalLineTo(13.5f)
                curveTo(12.53f, 9.0f, 11.75f, 9.78f, 11.75f, 10.75f)
                curveTo(11.75f, 11.72f, 12.53f, 12.5f, 13.5f, 12.5f)
                horizontalLineTo(15.25f)
                curveTo(16.22f, 12.5f, 17.0f, 13.28f, 17.0f, 14.25f)
                curveTo(17.0f, 15.22f, 16.22f, 16.0f, 15.25f, 16.0f)
                horizontalLineTo(13.5f)
                curveTo(12.53f, 16.0f, 11.75f, 15.22f, 11.75f, 14.25f)
            }
        }
        .build()
        return _js!!
    }

private var _js: ImageVector? = null
