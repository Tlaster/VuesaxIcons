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

public val BulkGroup.Status: ImageVector
    get() {
        if (_status != null) {
            return _status!!
        }
        _status = Builder(name = "Status", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2408f, 14.74f)
                curveTo(9.9108f, 14.41f, 9.4708f, 14.22f, 9.0008f, 14.22f)
                horizontalLineTo(3.9208f)
                curveTo(3.3108f, 14.22f, 2.7508f, 14.53f, 2.4308f, 15.05f)
                curveTo(2.1108f, 15.56f, 2.0808f, 16.17f, 2.3408f, 16.71f)
                curveTo(3.5708f, 19.23f, 5.7908f, 21.21f, 8.4308f, 22.14f)
                curveTo(8.6108f, 22.2f, 8.8108f, 22.24f, 9.0008f, 22.24f)
                curveTo(9.3508f, 22.24f, 9.7008f, 22.13f, 10.0008f, 21.92f)
                curveTo(10.4708f, 21.59f, 10.7508f, 21.05f, 10.7508f, 20.48f)
                lineTo(10.7608f, 15.98f)
                curveTo(10.7508f, 15.51f, 10.5708f, 15.07f, 10.2408f, 14.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.4799f, 9.6f)
                curveTo(21.3599f, 4.68f, 17.0499f, 1.25f, 11.9999f, 1.25f)
                curveTo(6.9499f, 1.25f, 2.6399f, 4.68f, 1.5199f, 9.6f)
                curveTo(1.3999f, 10.12f, 1.5199f, 10.65f, 1.8599f, 11.07f)
                curveTo(2.1999f, 11.49f, 2.6999f, 11.73f, 3.2399f, 11.73f)
                horizontalLineTo(20.7699f)
                curveTo(21.3099f, 11.73f, 21.8099f, 11.49f, 22.1499f, 11.07f)
                curveTo(22.4799f, 10.65f, 22.5999f, 10.11f, 22.4799f, 9.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.56f, 15.1f)
                curveTo(21.24f, 14.58f, 20.68f, 14.26f, 20.06f, 14.26f)
                lineTo(15.0f, 14.25f)
                curveTo(14.53f, 14.25f, 14.09f, 14.43f, 13.76f, 14.76f)
                curveTo(13.43f, 15.09f, 13.25f, 15.53f, 13.25f, 16.0f)
                lineTo(13.26f, 20.48f)
                curveTo(13.26f, 21.05f, 13.54f, 21.59f, 14.01f, 21.92f)
                curveTo(14.31f, 22.13f, 14.66f, 22.24f, 15.01f, 22.24f)
                curveTo(15.2f, 22.24f, 15.39f, 22.21f, 15.57f, 22.14f)
                curveTo(18.19f, 21.22f, 20.41f, 19.25f, 21.64f, 16.76f)
                curveTo(21.9f, 16.23f, 21.87f, 15.61f, 21.56f, 15.1f)
                close()
            }
        }
        .build()
        return _status!!
    }

private var _status: ImageVector? = null
