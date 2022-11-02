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

public val BulkGroup.Messagecircle: ImageVector
    get() {
        if (_messagecircle != null) {
            return _messagecircle!!
        }
        _messagecircle = Builder(name = "Messagecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                    pathFillType = NonZero) {
                moveTo(17.25f, 10.18f)
                verticalLineTo(12.81f)
                curveTo(17.25f, 12.98f, 17.24f, 13.14f, 17.22f, 13.3f)
                curveTo(17.07f, 15.07f, 16.02f, 15.95f, 14.1f, 15.95f)
                horizontalLineTo(13.84f)
                curveTo(13.68f, 15.95f, 13.52f, 16.03f, 13.42f, 16.16f)
                lineTo(12.63f, 17.21f)
                curveTo(12.28f, 17.68f, 11.72f, 17.68f, 11.37f, 17.21f)
                lineTo(10.58f, 16.16f)
                curveTo(10.49f, 16.05f, 10.3f, 15.95f, 10.16f, 15.95f)
                horizontalLineTo(9.9f)
                curveTo(7.8f, 15.95f, 6.75f, 15.43f, 6.75f, 12.8f)
                verticalLineTo(10.17f)
                curveTo(6.75f, 8.25f, 7.64f, 7.2f, 9.4f, 7.05f)
                curveTo(9.56f, 7.03f, 9.72f, 7.02f, 9.89f, 7.02f)
                horizontalLineTo(14.09f)
                curveTo(16.2f, 7.04f, 17.25f, 8.09f, 17.25f, 10.18f)
                close()
            }
        }
        .build()
        return _messagecircle!!
    }

private var _messagecircle: ImageVector? = null
