package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Videosquare: ImageVector
    get() {
        if (_videosquare != null) {
            return _videosquare!!
        }
        _videosquare = Builder(name = "Videosquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0996f, 12.0f)
                verticalLineTo(10.52f)
                curveTo(9.0996f, 8.61f, 10.4496f, 7.84f, 12.0996f, 8.79f)
                lineTo(13.3796f, 9.53f)
                lineTo(14.6596f, 10.27f)
                curveTo(16.3096f, 11.22f, 16.3096f, 12.78f, 14.6596f, 13.73f)
                lineTo(13.3796f, 14.47f)
                lineTo(12.0996f, 15.21f)
                curveTo(10.4496f, 16.16f, 9.0996f, 15.38f, 9.0996f, 13.48f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _videosquare!!
    }

private var _videosquare: ImageVector? = null
