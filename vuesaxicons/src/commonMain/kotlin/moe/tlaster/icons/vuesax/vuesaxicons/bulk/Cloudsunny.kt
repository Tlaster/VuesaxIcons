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

public val BulkGroup.Cloudsunny: ImageVector
    get() {
        if (_cloudsunny != null) {
            return _cloudsunny!!
        }
        _cloudsunny = Builder(name = "Cloudsunny", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6098f, 10.83f)
                curveTo(19.8398f, 9.91f, 18.8498f, 9.31f, 17.6998f, 9.05f)
                curveTo(17.4398f, 7.89f, 16.9898f, 6.89f, 16.3298f, 6.06f)
                curveTo(16.3098f, 6.03f, 16.2898f, 6.0f, 16.2698f, 5.98f)
                curveTo(14.0698f, 3.32f, 10.4698f, 3.33f, 8.0398f, 4.71f)
                curveTo(5.9598f, 5.9f, 4.1898f, 8.41f, 5.1198f, 11.99f)
                curveTo(2.9898f, 12.51f, 2.0098f, 14.37f, 2.0098f, 16.05f)
                curveTo(2.0098f, 17.93f, 3.2398f, 20.04f, 5.9798f, 20.24f)
                horizontalLineTo(16.3198f)
                curveTo(16.3298f, 20.24f, 16.3498f, 20.24f, 16.3598f, 20.24f)
                curveTo(17.7798f, 20.24f, 19.1398f, 19.71f, 20.1898f, 18.75f)
                curveTo(22.6998f, 16.53f, 22.3698f, 12.91f, 20.6098f, 10.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7609f, 8.74f)
                curveTo(21.7609f, 9.64f, 21.4409f, 10.5f, 20.8609f, 11.16f)
                curveTo(20.7909f, 11.05f, 20.7009f, 10.94f, 20.6109f, 10.83f)
                curveTo(19.8509f, 9.92f, 18.8509f, 9.3f, 17.7009f, 9.05f)
                curveTo(17.4509f, 7.89f, 16.9909f, 6.9f, 16.3309f, 6.07f)
                curveTo(16.3209f, 6.04f, 16.2909f, 6.01f, 16.2709f, 5.99f)
                curveTo(16.1709f, 5.87f, 16.0609f, 5.76f, 15.9609f, 5.65f)
                curveTo(16.5709f, 5.23f, 17.2709f, 5.01f, 18.0309f, 5.01f)
                curveTo(20.0909f, 5.01f, 21.7609f, 6.68f, 21.7609f, 8.74f)
                close()
            }
        }
        .build()
        return _cloudsunny!!
    }

private var _cloudsunny: ImageVector? = null
