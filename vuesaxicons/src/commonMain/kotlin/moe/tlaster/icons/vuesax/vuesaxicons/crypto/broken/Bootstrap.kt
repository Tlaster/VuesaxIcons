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

public val BrokenGroup.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                curveTo(5.34f, 3.0f, 4.0f, 4.34f, 4.0f, 6.0f)
                verticalLineTo(6.84f)
                curveTo(4.0f, 7.61f, 3.88f, 8.37f, 3.63f, 9.1f)
                curveTo(3.25f, 10.23f, 2.19f, 11.0f, 1.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.19f, 13.0f, 3.25f, 13.76f, 3.63f, 14.9f)
                curveTo(3.87f, 15.63f, 4.0f, 16.4f, 4.0f, 17.16f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.66f, 5.34f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.66f, 21.0f, 20.0f, 19.66f, 20.0f, 18.0f)
                verticalLineTo(17.16f)
                curveTo(20.0f, 16.39f, 20.12f, 15.63f, 20.37f, 14.9f)
                curveTo(20.75f, 13.77f, 21.81f, 13.0f, 23.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.81f, 11.0f, 20.75f, 10.24f, 20.37f, 9.1f)
                curveTo(20.13f, 8.37f, 20.0f, 7.6f, 20.0f, 6.84f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.34f, 18.66f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(12.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.75f, 12.0001f)
                horizontalLineTo(12.67f)
                curveTo(13.82f, 12.0001f, 14.75f, 12.9301f, 14.75f, 14.0801f)
                curveTo(14.75f, 15.2301f, 13.82f, 16.1601f, 12.67f, 16.1601f)
                horizontalLineTo(9.75f)
                verticalLineTo(7.8301f)
                horizontalLineTo(12.67f)
                curveTo(13.82f, 7.8301f, 14.75f, 8.7601f, 14.75f, 9.9101f)
                curveTo(14.75f, 11.0601f, 13.82f, 11.9901f, 12.67f, 11.9901f)
                horizontalLineTo(9.75f)
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
