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

public val BulkGroup.Documentcloud: ImageVector
    get() {
        if (_documentcloud != null) {
            return _documentcloud!!
        }
        _documentcloud = Builder(name = "Documentcloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3.0f)
                curveTo(13.31f, 2.45f, 12.86f, 2.0f, 12.31f, 2.0f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2.0f, 2.5f, 4.0f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20.0f, 4.99f, 22.0f, 8.07f, 22.0f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22.0f, 21.5f, 20.0f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7997f, 2.21f)
                curveTo(15.3897f, 1.8f, 14.6797f, 2.08f, 14.6797f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.6797f, 7.6f, 15.9197f, 8.81f, 17.4297f, 8.81f)
                curveTo(18.3797f, 8.82f, 19.6997f, 8.82f, 20.8297f, 8.82f)
                curveTo(21.3997f, 8.82f, 21.6997f, 8.15f, 21.2997f, 7.75f)
                curveTo(19.8597f, 6.3f, 17.2797f, 3.69f, 15.7997f, 2.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7605f, 19.2598f)
                curveTo(12.4105f, 19.4298f, 12.4105f, 22.8298f, 14.7605f, 22.9998f)
                horizontalLineTo(20.3205f)
                curveTo(20.9905f, 22.9998f, 21.6505f, 22.7498f, 22.1405f, 22.2998f)
                curveTo(23.7905f, 20.8598f, 22.9105f, 17.9798f, 20.7405f, 17.7098f)
                curveTo(19.9605f, 13.0198f, 13.1805f, 14.7998f, 14.7805f, 19.2698f)
            }
        }
        .build()
        return _documentcloud!!
    }

private var _documentcloud: ImageVector? = null
