package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val BulkGroup.Zoom: ImageVector
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = Builder(name = "Zoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 9.6798f)
                verticalLineTo(12.4798f)
                curveTo(6.25f, 14.0198f, 7.5f, 15.2598f, 9.04f, 15.2498f)
                lineTo(12.72f, 15.2198f)
                curveTo(13.23f, 15.2198f, 13.64f, 14.7998f, 13.64f, 14.2998f)
                verticalLineTo(11.5298f)
                curveTo(13.64f, 9.9998f, 12.4f, 8.7598f, 10.87f, 8.7598f)
                horizontalLineTo(7.18f)
                curveTo(6.66f, 8.7598f, 6.25f, 9.1698f, 6.25f, 9.6798f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 10.0196f)
                verticalLineTo(13.9996f)
                curveTo(17.75f, 14.4296f, 17.27f, 14.6896f, 16.91f, 14.4496f)
                lineTo(14.99f, 13.1696f)
                curveTo(14.84f, 13.0696f, 14.75f, 12.8996f, 14.75f, 12.7196f)
                verticalLineTo(11.2996f)
                curveTo(14.75f, 11.1196f, 14.84f, 10.9496f, 14.99f, 10.8496f)
                lineTo(16.91f, 9.5696f)
                curveTo(17.27f, 9.3296f, 17.75f, 9.5896f, 17.75f, 10.0196f)
                close()
            }
        }
        .build()
        return _zoom!!
    }

private var _zoom: ImageVector? = null
