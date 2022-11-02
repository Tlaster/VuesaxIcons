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

public val BulkGroup.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3108f, 11.25f)
                curveTo(17.3308f, 11.51f, 17.2408f, 11.78f, 17.0408f, 11.98f)
                lineTo(11.0208f, 18.0f)
                curveTo(9.6908f, 19.33f, 8.3508f, 19.33f, 7.0108f, 18.0f)
                lineTo(3.0008f, 13.99f)
                curveTo(2.3208f, 13.3f, 1.9808f, 12.61f, 2.0008f, 11.92f)
                horizontalLineTo(2.0708f)
                lineTo(17.1908f, 11.26f)
                lineTo(17.3108f, 11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.04f, 10.6402f)
                lineTo(9.69f, 3.2901f)
                lineTo(8.82f, 2.4201f)
                curveTo(8.53f, 2.1301f, 8.05f, 2.1301f, 7.76f, 2.4201f)
                curveTo(7.47f, 2.7101f, 7.47f, 3.1901f, 7.76f, 3.4801f)
                lineTo(8.63f, 4.3501f)
                lineTo(3.0f, 9.9801f)
                curveTo(2.36f, 10.6201f, 2.02f, 11.2701f, 2.0f, 11.9201f)
                horizontalLineTo(2.07f)
                lineTo(17.19f, 11.2602f)
                lineTo(17.31f, 11.2502f)
                curveTo(17.3f, 11.0302f, 17.2f, 10.8002f, 17.04f, 10.6402f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 22.75f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22.0f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 21.25f, 16.75f, 21.59f, 16.75f, 22.0f)
                curveTo(16.75f, 22.41f, 16.41f, 22.75f, 16.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 14.7798f)
                curveTo(19.09f, 14.4998f, 18.61f, 14.4998f, 18.35f, 14.7798f)
                curveTo(18.04f, 15.1198f, 16.5f, 16.8598f, 16.5f, 18.1698f)
                curveTo(16.5f, 19.4698f, 17.55f, 20.5198f, 18.85f, 20.5198f)
                curveTo(20.15f, 20.5198f, 21.2f, 19.4698f, 21.2f, 18.1698f)
                curveTo(21.2f, 16.8598f, 19.66f, 15.1198f, 19.35f, 14.7798f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
