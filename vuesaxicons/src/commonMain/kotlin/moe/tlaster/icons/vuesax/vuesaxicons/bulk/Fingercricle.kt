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

public val BulkGroup.Fingercricle: ImageVector
    get() {
        if (_fingercricle != null) {
            return _fingercricle!!
        }
        _fingercricle = Builder(name = "Fingercricle", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.9996f, 9.8701f)
                curveTo(11.5096f, 9.8701f, 11.0996f, 10.2701f, 11.0996f, 10.7701f)
                verticalLineTo(13.2401f)
                curveTo(11.0996f, 13.7401f, 11.4996f, 14.1401f, 11.9996f, 14.1401f)
                curveTo(12.4996f, 14.1401f, 12.8996f, 13.7401f, 12.8996f, 13.2401f)
                verticalLineTo(10.7701f)
                curveTo(12.8996f, 10.2701f, 12.4896f, 9.8701f, 11.9996f, 9.8701f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.5499f)
                curveTo(9.38f, 17.5499f, 7.25f, 15.4199f, 7.25f, 12.7999f)
                verticalLineTo(11.2f)
                curveTo(7.25f, 8.58f, 9.38f, 6.45f, 12.0f, 6.45f)
                curveTo(14.62f, 6.45f, 16.75f, 8.58f, 16.75f, 11.2f)
                verticalLineTo(12.7999f)
                curveTo(16.75f, 15.4199f, 14.62f, 17.5499f, 12.0f, 17.5499f)
                close()
                moveTo(12.0f, 7.95f)
                curveTo(10.21f, 7.95f, 8.75f, 9.41f, 8.75f, 11.2f)
                verticalLineTo(12.7999f)
                curveTo(8.75f, 14.5899f, 10.21f, 16.0499f, 12.0f, 16.0499f)
                curveTo(13.79f, 16.0499f, 15.25f, 14.5899f, 15.25f, 12.7999f)
                verticalLineTo(11.2f)
                curveTo(15.25f, 9.41f, 13.79f, 7.95f, 12.0f, 7.95f)
                close()
            }
        }
        .build()
        return _fingercricle!!
    }

private var _fingercricle: ImageVector? = null
