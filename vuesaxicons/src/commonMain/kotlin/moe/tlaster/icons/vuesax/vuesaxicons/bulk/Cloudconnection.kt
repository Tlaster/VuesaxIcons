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

public val BulkGroup.Cloudconnection: ImageVector
    get() {
        if (_cloudconnection != null) {
            return _cloudconnection!!
        }
        _cloudconnection = Builder(name = "Cloudconnection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2007f, 14.7799f)
                curveTo(18.3407f, 15.5699f, 17.2007f, 16.0099f, 16.0307f, 15.9999f)
                horizontalLineTo(6.3707f)
                curveTo(2.3007f, 15.7099f, 2.2907f, 9.7999f, 6.3707f, 9.5099f)
                horizontalLineTo(6.4107f)
                curveTo(3.6207f, 1.7499f, 15.4107f, -1.3401f, 16.7607f, 6.7999f)
                curveTo(20.5307f, 7.2799f, 22.0607f, 12.2899f, 19.2007f, 14.7799f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 21.0f)
                curveTo(18.75f, 21.41f, 18.41f, 21.75f, 18.0f, 21.75f)
                horizontalLineTo(14.0f)
                curveTo(13.95f, 21.75f, 13.91f, 21.75f, 13.86f, 21.73f)
                curveTo(13.57f, 22.47f, 12.84f, 23.0f, 12.0f, 23.0f)
                curveTo(11.16f, 23.0f, 10.43f, 22.47f, 10.14f, 21.73f)
                curveTo(10.09f, 21.75f, 10.05f, 21.75f, 10.0f, 21.75f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 21.75f, 5.25f, 21.41f, 5.25f, 21.0f)
                curveTo(5.25f, 20.59f, 5.59f, 20.25f, 6.0f, 20.25f)
                horizontalLineTo(10.0f)
                curveTo(10.05f, 20.25f, 10.09f, 20.25f, 10.14f, 20.27f)
                curveTo(10.34f, 19.75f, 10.75f, 19.34f, 11.27f, 19.14f)
                curveTo(11.25f, 19.09f, 11.25f, 19.05f, 11.25f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.0f)
                curveTo(12.75f, 19.05f, 12.75f, 19.09f, 12.73f, 19.14f)
                curveTo(13.25f, 19.34f, 13.66f, 19.75f, 13.86f, 20.27f)
                curveTo(13.91f, 20.25f, 13.95f, 20.25f, 14.0f, 20.25f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 20.25f, 18.75f, 20.59f, 18.75f, 21.0f)
                close()
            }
        }
        .build()
        return _cloudconnection!!
    }

private var _cloudconnection: ImageVector? = null
