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

public val LinearGroup.Clock1: ImageVector
    get() {
        if (_clock1 != null) {
            return _clock1!!
        }
        _clock1 = Builder(name = "Clock1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.66f)
                verticalLineTo(12.45f)
                lineTo(13.4f, 13.85f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                curveTo(5.5f, 8.41f, 8.41f, 5.5f, 12.0f, 5.5f)
                curveTo(15.59f, 5.5f, 18.5f, 8.41f, 18.5f, 12.0f)
                curveTo(18.5f, 14.08f, 17.52f, 15.94f, 16.0f, 17.13f)
                horizontalLineTo(15.99f)
                curveTo(14.89f, 17.99f, 13.51f, 18.5f, 12.0f, 18.5f)
                curveTo(10.51f, 18.5f, 9.14f, 18.0f, 8.04f, 17.15f)
                horizontalLineTo(8.03f)
                curveTo(6.49f, 15.96f, 5.5f, 14.1f, 5.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.03f, 17.15f)
                horizontalLineTo(8.04f)
                curveTo(9.14f, 18.0f, 10.51f, 18.5f, 12.0f, 18.5f)
                curveTo(13.51f, 18.5f, 14.89f, 17.99f, 15.99f, 17.13f)
                horizontalLineTo(16.0f)
                lineTo(15.49f, 19.6f)
                curveTo(15.0f, 21.5f, 13.9f, 22.0f, 12.55f, 22.0f)
                horizontalLineTo(11.46f)
                curveTo(10.11f, 22.0f, 9.0f, 21.5f, 8.52f, 19.59f)
                lineTo(8.03f, 17.15f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.03f, 6.85f)
                horizontalLineTo(8.04f)
                curveTo(9.14f, 6.0f, 10.51f, 5.5f, 12.0f, 5.5f)
                curveTo(13.51f, 5.5f, 14.89f, 6.01f, 15.99f, 6.87f)
                horizontalLineTo(16.0f)
                lineTo(15.49f, 4.4f)
                curveTo(15.0f, 2.5f, 13.9f, 2.0f, 12.55f, 2.0f)
                horizontalLineTo(11.46f)
                curveTo(10.11f, 2.0f, 9.0f, 2.5f, 8.52f, 4.41f)
                lineTo(8.03f, 6.85f)
                close()
            }
        }
        .build()
        return _clock1!!
    }

private var _clock1: ImageVector? = null
